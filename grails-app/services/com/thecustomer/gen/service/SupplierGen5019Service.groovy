// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen5019Service {

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
    /** Derived accessor for notes (generated filler). */
    def computeNotes0() { return 39 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn1() { return 839 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 3078 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 2359 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 1555 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 1173 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 5906 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 4417 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 1701 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 8787 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 1235 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 635 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 3848 }
    /** Derived accessor for region (generated filler). */
    def computeRegion13() { return 1929 }
}
