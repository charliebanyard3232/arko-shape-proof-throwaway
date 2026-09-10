// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class CatalogueGen1723Service {

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
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 72 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 8708 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 4945 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 9666 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 2621 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 1670 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 3707 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 6320 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 9874 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 6679 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 8151 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 1870 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 6228 }
    /** Derived accessor for description (generated filler). */
}
