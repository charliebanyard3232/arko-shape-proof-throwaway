// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen6413Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 5512 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold1() { return 9427 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 3835 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 2285 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 8942 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 5074 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 5351 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 7399 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 839 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 2225 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 3441 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 4118 }
    /** Derived accessor for code (generated filler). */
    def computeCode12() { return 4282 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 7690 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 2674 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId15() { return 9617 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 1072 }
}
